package org.ms.explorer.persistence.repo;

import org.ms.explorer.type.Neuron;
import org.ms.explorer.type.Synapse;

public interface Repository {
  
  public Neuron persist(Neuron neuron);
  
  public Synapse persist(Synapse synapse);
  
  public Neuron find(Neuron neuron);
  
  public Neuron findNeuronById(String id);
  
  public Synapse find(Synapse synapse);
  
  public Synapse findSynapseById(String id);
  
  public void deleteAll();
}
