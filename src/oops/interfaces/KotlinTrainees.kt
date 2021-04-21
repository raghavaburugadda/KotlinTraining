package oops.interfaces

class KotlinTrainees : ZoomMeeting, SkypeMeeting {

    override fun startMeeting(userList: List<String>) {
        for (user in userList)
            println("$user meeting has started")
    }

    override fun recordMeeting(videoRecording: String) {
        super<ZoomMeeting>.recordMeeting(videoRecording)
        super<SkypeMeeting>.recordMeeting(videoRecording)
        println("meeting is recording $videoRecording")
    }

    override fun endMeeting(userList: List<String>) {
        super<ZoomMeeting>.endMeeting(userList)
        super<SkypeMeeting>.endMeeting(userList)
        for (user in userList)
            println("$user meeting has ended")
    }
}