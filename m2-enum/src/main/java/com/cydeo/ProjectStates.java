package com.cydeo;

public enum ProjectStates {

    OPEN,CLOSE,PROGRESS("IN PROGRESS");

  String status;

    ProjectStates(String status) {
        this.status = status;
    }

    ProjectStates() {
    }


}
