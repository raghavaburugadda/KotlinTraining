package oops.interfaces

class Trainer(val trainerName: String) {

    fun startTraining(
        zoomMeeting: ZoomMeeting,
        trainees: ArrayList<String>,
        trainingContent: String
    ) {
        zoomMeeting.startMeeting(trainees)
        zoomMeeting.recordMeeting(trainingContent)
        zoomMeeting.endMeeting(trainees)
    }

    fun startMeeting(zoomMeeting: ZoomMeeting) {

    }
}