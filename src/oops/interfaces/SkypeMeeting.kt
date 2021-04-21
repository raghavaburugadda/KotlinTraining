package oops.interfaces

interface SkypeMeeting {
    fun startMeeting(userList: List<String>) {
        println("from skype Meeting starting")
    }

    fun recordMeeting(videoRecording: String) {
        print("extra token")
    }

    fun endMeeting(userList: List<String>) {
        println("from skype Meeting end")
    }
}