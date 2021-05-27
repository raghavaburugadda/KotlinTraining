package oops.observerpattern

class MobileClient(private val deviceName:String):IObserver{
    override fun onChange(news: News) {
        println("News Updated on  $deviceName : ${news.updatedNews} at ${news.updatedTime}")
    }
}