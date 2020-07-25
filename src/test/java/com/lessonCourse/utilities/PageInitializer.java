package com.lessonCourse.utilities;

import com.lessonCourse.pages.DashBoard;

public class PageInitializer extends MyDriver {
    public static DashBoard dashBoard;

    public static void initializeAllPages() {
        dashBoard = new DashBoard();
    }
}
