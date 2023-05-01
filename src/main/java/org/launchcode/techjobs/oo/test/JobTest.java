package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {


    //Use assertNotEquals to verify that the IDs of the two objects are distinct.
    @Test //PASS
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }


    //Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the
    // class and value of each field. Your test should have 5 assert statements of each type.
    @Test //PASS
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job.getName() instanceof String);
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        //Book info:
        // The instanceof keyword can be used to check the class of an object.
        //The result of the comparison is a boolean (aka assertTrue)
        //Example: objectName instanceof ClassName

        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
        //Book info:
        // If you had a Job instance, you could get the name of the employer this way job is an instance of Job
        //Example: String employerName = job.getEmployer().getValue();

        }


        //Generate two Job objects that have identical field values EXCEPT for id (ids are always unique? pointless to add)
        // Test that equals returns false (aka assertFalse)
        @Test //PASS
        public void testJobsForEquality(){
        Job job1 = new Job("SOSS 4", new Employer("Wells Fargo"), new Location("STL"), new PositionType("Operations"), new CoreCompetency("Data entry"));
        Job job2 = new Job("SOSS 4", new Employer("Wells Fargo"), new Location("STL"), new PositionType("Operations"), new CoreCompetency("Data entry"));

        //to use assertFalse it needs a boolean condition initialized below
        boolean notEqual = job1.equals(job2);
        //even tho all the values are same, the id will always be unique so job1.equals(job2) will always be false
            assertFalse(notEqual);

        }


    //1) When passed a Job object, it should return a string that contains a blank line before and after the job information.
    //2) The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line.
    //3) If a field is empty, the method should add, “Data not available” after the label.
    //4) (Bonus) If a Job object ONLY contains data for the id field, the method should return, “OOPS! This job does not seem to exist.” (try/catch/throw)
    //Be sure to use assertEquals to verify that these characters are correct
    //This test should check that the first and last characters of the string both the newline character, \n.
    //Recall that can get the character at a given position in a string using the string method charAt.

        @Test //PASS
        public void testToStringStartsAndEndsWithNewLine(){
            Job job = new Job("SOSS 4", new Employer("Wells Fargo"), new Location("STL"), new PositionType("Operations"), new CoreCompetency("Data entry"));
            String jobTest = job.toString();
            assertEquals(jobTest.charAt(0), '\n');
            assertEquals(jobTest.charAt(jobTest.length() - 1), '\n');
        }

        @Test //PASS, not sure why job.getId() needs + 1???
        public void testToStringContainsCorrectLabelsAndData() {
            Job job = new Job("SOSS 4", new Employer("Wells Fargo"), new Location("STL"), new PositionType("Operations"), new CoreCompetency("Data entry"));
            String jobTest = job.toString();
            assertEquals(jobTest, "\nID: " + (job.getId() + 1) + "\n" +
                    "\nName: SOSS 4\n" +
                    "\nEmployer: Wells Fargo\n" +
                    "\nLocation: STL\n" +
                    "\nPosition Type: Operations\n" +
                    "\nCore Competency: Data entry\n");
        }

        @Test //PASS
        public void testToStringHandlesEmptyField() {
            Job testJob = new Job(null, null, null, null, null);
            String emptyFieldTest =
                    "\n" +
                    (testJob.getId()) +
                    "\n" +
                    "Name: Data not available" +
                    "\n" +
                    "Employer: Data not available" +
                    "\n" +
                    "Location: Data not available" +
                    "\n" +
                    "Position Type: Data not available" +
                    "\n" +
                    "Core Competency: Data not available" +
                    "\n";
        }

}

