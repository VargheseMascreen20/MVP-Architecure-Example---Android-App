package com.var.mvparchitectureexample;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Model implements Contract.Model {

    private List<String> arrayList = Arrays.asList(
            "“Fortune favors the bold.” – Virgil.",
            "“I think, therefore I am.” – René Descartes.",
            "\"Life is what happens when you’re busy making other plans.\" - John Lennon",
            "\"When the going gets tough, the tough get going.\" - Joe Kennedy",
            "\"You must be the change you wish to see in the world.\" - Mahatma Gandhi"
    );

    @Override
    public void getNextCourse(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(getRandomString());
            }
        }, 1200);
    }

    private String getRandomString() {
        Random random = new Random();
        int index = random.nextInt(arrayList.size());
        return arrayList.get(index);
    }
}
