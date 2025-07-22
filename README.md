class PinchZoomItemTouchListener(
    private val recyclerView: RecyclerView
) : RecyclerView.OnItemTouchListener {

    private var scaleFactor = 1f
    private val scaleGestureDetector: ScaleGestureDetector
    private val gestureDetector: GestureDetector

    init {
        scaleGestureDetector = ScaleGestureDetector(
            recyclerView.context,
            object : ScaleGestureDetector.SimpleOnScaleGestureListener() {
                override fun onScale(detector: ScaleGestureDetector): Boolean {
                    scaleFactor *= detector.scaleFactor
                    scaleFactor = scaleFactor.coerceIn(1f, 2.5f)
                    applyScaleToItems()
                    return true
                }
            }
        )

        gestureDetector = GestureDetector(
            recyclerView.context,
            object : GestureDetector.SimpleOnGestureListener() {
                override fun onDoubleTap(e: MotionEvent?): Boolean {
                    scaleFactor = 1f
                    applyScaleToItems()
                    return true
                }
            }
        )
    }

    private fun applyScaleToItems() {
        for (i in 0 until recyclerView.childCount) {
            val child = recyclerView.getChildAt(i)
            child?.apply {
                pivotX = (width / 2).toFloat()
                pivotY = (height / 2).toFloat()
                scaleX = scaleFactor
                scaleY = scaleFactor

                // Adjust translation to keep layout compact (reduce gaps)
                val offsetX = (scaleFactor - 1f) * width / 2
                val offsetY = (scaleFactor - 1f) * height / 2
                translationX = -offsetX
                translationY = -offsetY
            }
        }
    }

    override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {
        gestureDetector.onTouchEvent(e)
        scaleGestureDetector.onTouchEvent(e)
        return false
    }

    override fun onTouchEvent(rv: RecyclerView, e: MotionEvent) {
        gestureDetector.onTouchEvent(e)
        scaleGestureDetector.onTouchEvent(e)
    }

    override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {}
}
