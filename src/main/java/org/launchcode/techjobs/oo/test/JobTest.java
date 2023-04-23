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


}

