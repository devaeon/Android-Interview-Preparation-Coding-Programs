package com.android.interview.preparation.javaCode;

import com.android.interview.preparation.kotlinCode.CoroutineHelper;
import com.android.interview.preparation.kotlinCode.FlowHelper;

public class JavaCaller {

    public static void main(String[] args) throws InterruptedException {
        JavaCaller javaCallerObj = new JavaCaller();
        javaCallerObj.callCoroutine();
        javaCallerObj.callFlow();
        javaCallerObj.callFlowAsCallback();
        javaCallerObj.observeLiveData();

        // Wait to allow coroutines and flows to finish
        Thread.sleep(5000); // Wait 5 seconds before exiting
    }
    public void callCoroutine() {
        CoroutineHelper.INSTANCE.fetchDataAsync()
                .thenAccept(result -> System.out.println("Received: " + result))
                .exceptionally(e -> {
                    e.printStackTrace();
                    return null;
                });
    }

    public void callFlowAsCallback() {
        FlowHelper.INSTANCE.getNumbersAsCallback(number -> {
            System.out.println("Received: " + number);
            return null;
        });
    }

    public void callFlow() {
        FlowHelper.INSTANCE.getNumbersAsCallback(number -> {
            System.out.println("Received: " + number);
            return null;
        });
    }

    public void observeLiveData() {
        //LiveDataHelper.INSTANCE.getData().observe(lifecycleOwner, (Observer<String>) value -> System.out.println("Received LiveData: " + value));
    }
}