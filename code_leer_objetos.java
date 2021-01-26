@Autowired
	public PersonaRepository personaRepository;
	
@Autowired
public TelefonoRepository telefonoRepository;


//************************* Ejemplos de lecturas de objetos persistentes

public void Lecturas( ){


  System.out.println(personaRepository.findById(2L).getProfesion());
		 
  for (int i = 0; i < personaRepository.listaProfesiones().size(); i++) {
			 System.out.println(personaRepository.listaProfesiones().get(i)); 
  } 
     
  for(Persona p : personaRepository.findAll()) {
			 System.out.println(p.getNombre()+ " " +p.getProfesion()); 
  }

}
