package com.var.mvparchitectureexample;

public interface Contract {
    interface View {

        void showProgress();

        void hideProgress();

        void setString(String string);
    }

    interface Model {

        void getNextCourse(Contract.Model.OnFinishedListener onFinishedListener);

        interface OnFinishedListener {
            void onFinished(String string);
        }
    }

    interface Presenter {


        void onButtonClick();

        void onDestroy();
    }
}
