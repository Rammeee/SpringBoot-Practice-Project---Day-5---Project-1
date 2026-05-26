package com.example;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BugDAO bugDAO= new BugDAO();
        Bug bug1 = new Bug(1, "Null Pointer Exception", "App crashes when clicking on button", "Open");
        bugDAO.insertBug(bug1);
        Bug bug2 = new Bug(2, "UI Glitch", "Text overlaps on smaller screens", "Open");
        bugDAO.insertBug(bug2);
        List<Bug> bugs = bugDAO.getAllBugs();
        for (Bug bug : bugs) {
            System.out.println("ID: " + bug.getId() + ", Title: " + bug.getTitle() + ", Description: " + bug.getDescription() + ", Status: " + bug.getStatus());
        }
    }
}
