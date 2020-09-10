package com.example.customlisteners;

public class DoSomeTask {

    private DataInterface listener;

    public DoSomeTask() {
        // set null or default listener or accept as argument to constructor
        this.listener = null;
    }

    // Assign the listener implementing events interface that will receive the events
    public void setCustomObjectListener(DataInterface listener) {
        this.listener = listener;
        waitForLongRunningOperation();
    }


    void waitForLongRunningOperation() {
        if (listener != null) {
            listener.onObjectReady("Please wait for completion");//Trigger the listener
            listener.onDataLoaded("Data download Complete");//Trigger the listener
        }

    }
}
