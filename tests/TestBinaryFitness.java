import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

import org.whs.GeneticAlgorithm.Individual.Fitness.BinaryFitness;

public class TestBinaryFitness {
    @Test
    public void testClass() {
        byte[] genes = {1,0,1,1};
        BinaryFitness Fitness = new BinaryFitness(genes);
        assertThat(Fitness, instanceOf(BinaryFitness.class));
    }

    @Test
    public void testFitness() {
        byte[] genes = {1,0,1,1};
        BinaryFitness fitness = new BinaryFitness(genes);
        float fitnessValue = fitness.obtainFitnessValue();
        assertEquals(fitnessValue,3,0);
    }
}
