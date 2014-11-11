package org.whs.GeneticAlgorithm.Individual.Fitness;

public class BinaryFitness implements Fitness {
    private float value;

    public BinaryFitness(byte[] genes) {
        value = 0;
        for(int i = 0; i < genes.length; i++) {
            value += genes[i];
        }
    }

    public float obtainFitnessValue() {
        return value;
    }
}