package oops.observerpattern

fun main(args: Array<String>) {
    val bbcNewsChannel=BBCNewsChannel()
    val mobileClient1=getClient("One Plus")
    val mobileClient2=getClient("Samsung")
    val mobileClient3=getClient("VIVO")
    val mobileClient4=getClient("iPhone")



    bbcNewsChannel.subscribe(mobileClient1)
    bbcNewsChannel.subscribe(mobileClient2)
    bbcNewsChannel.subscribe(mobileClient3)
    bbcNewsChannel.subscribe(mobileClient4)

    val updatedNews=News("92% Vaccination Completed in US"
    ,"27-May-2021 at 6.50pm")
    bbcNewsChannel.update(updatedNews)

    bbcNewsChannel.unSubscribe(mobileClient1)

    val updatedNews1=News("95% Vaccination Completed in US"
        ,"27-May-2021 at 7.50pm")
    bbcNewsChannel.update(updatedNews1)
}

fun getClient(deviceName: String): MobileClient {
    return MobileClient(deviceName)
}