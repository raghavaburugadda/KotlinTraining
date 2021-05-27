package oops.observerpattern

class BBCNewsChannel : IObservable {
    private val mySubscribers = mutableListOf<MobileClient>()

    override fun subscribe(client: MobileClient) {
        mySubscribers.add(client)
    }

    override fun unSubscribe(client: MobileClient) {
        mySubscribers.remove(client)
    }

    override fun update(news: News) {
        for (client in mySubscribers)
            client.onChange(news)
    }
}