package oops.observerpattern

interface IObservable {
    fun subscribe(client:MobileClient)
    fun unSubscribe(client: MobileClient)
    fun update(news: News)
}