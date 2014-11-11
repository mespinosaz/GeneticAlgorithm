package org.whs.GeneticAlgorithm.Individual;

import org.whs.GeneticAlgorithm.Individual.Fitness.Fitness;

public abstract class Individual {
    public Individual() {
        generateIndividual();
    }

    protected abstract void generateIndividual();

    public abstract float obtainFitness();
}