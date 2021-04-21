package oops.interfaces

class JavaTrainees:ZoomMeeting{
    override fun startMeeting(userList: List<String>) {
        for (user in userList)
            println("$user meeting has started")
    }

    override fun recordMeeting(videoRecording: String) {
        println("meeting is recording $videoRecording")
    }

    override fun endMeeting(userList: List<String>) {
        for (user in userList)
            println("$user meeting has ended")
    }
}