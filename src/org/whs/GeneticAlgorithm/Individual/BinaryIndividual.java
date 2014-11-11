package org.whs.GeneticAlgorithm.Individual;

import org.whs.GeneticAlgorithm.Individual.Fitness.Fitness;
import org.whs.GeneticAlgorithm.Individual.Fitness.BinaryFitness;

public class BinaryIndividual extends Individual {
    public static final int NUMBER_OF_GENES = 128;
    private byte[] genes;

    public BinaryIndividual() {
        super();
    }

    protected void generateIndividual() {
        genes = new byte[NUMBER_OF_GENES];
        for (int i = 0; i < NUMBER_OF_GENES; i++) {
            genes[i] = (byte) Math.round(Math.random());
        }
    }

    public float obtainFitness() {
        BinaryFitness fitness = new BinaryFitness(genes);
        return fitness.obtainFitnessValue();
    }
}