
package com.portafolioFinal.Anadeska.Interface;

import com.portafolioFinal.Anadeska.Entity.Persona;
import java.util.List;

public interface IPersonaService {
  public List<Persona> getPersona();
  
  public void savePersona(Persona persona);
  
  public void deletePersona(Long id);
  
  public Persona findPersona(Long id);    
}
