import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

import org.whs.GeneticAlgorithm.Individual.BinaryIndividual;

public class TestBinaryIndividual {
    @Test
    public void testClass() {
        BinaryIndividual individual = new BinaryIndividual();
        assertThat(individual, instanceOf(BinaryIndividual.class));
    }

    @Test
    public void testFitness() {
        BinaryIndividual individual = new BinaryIndividual();
        float fitness = individual.obtainFitness();
        assertTrue(fitness >= 0 && fitness <= BinaryIndividual.NUMBER_OF_GENES);
    }
}
