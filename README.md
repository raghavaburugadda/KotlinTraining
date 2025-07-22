class PinchZoomItemTouchListener(
    private val recyclerView: RecyclerView
) : RecyclerView.OnItemTouchListener {

    private var scaleFactor = 1f
    private val scaleGestureDetector: ScaleGestureDetector

    init {
        scaleGestureDetector = ScaleGestureDetector(
            recyclerView.context,
            object : ScaleGestureDetector.SimpleOnScaleGestureListener() {
                override fun onScale(detector: ScaleGestureDetector): Boolean {
                    scaleFactor *= detector.scaleFactor
                    scaleFactor = scaleFactor.coerceIn(0.8f, 2.5f)

                    applyScaleToItems(scaleFactor)
                    return true
                }
            }
        )
    }

    private fun applyScaleToItems(scale: Float) {
        for (i in 0 until recyclerView.childCount) {
            val child = recyclerView.getChildAt(i)
            child?.apply {
                pivotX = (width / 2).toFloat()
                pivotY = (height / 2).toFloat()
                scaleX = scale
                scaleY = scale

                // Translate back to reduce layout gap appearance
                val offsetX = (scale - 1f) * width / 2
                val offsetY = (scale - 1f) * height / 2
                translationX = -offsetX
                translationY = -offsetY
            }
        }
    }

    override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {
        scaleGestureDetector.onTouchEvent(e)
        return false // Let click, scroll events pass through
    }

    override fun onTouchEvent(rv: RecyclerView, e: MotionEvent) {
        scaleGestureDetector.onTouchEvent(e)
    }

    override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {}
}
