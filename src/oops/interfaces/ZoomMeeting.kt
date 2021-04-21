package oops.interfaces

interface ZoomMeeting {
    fun startMeeting(userList: List<String>) {
        println("from Zoom Meeting starting")
    }

    fun recordMeeting(videoRecording: String) {
        println("from Zoom recording")
    }

    fun endMeeting(userList: List<String>) {
        println("from Zoom Meeting end")
    }
}