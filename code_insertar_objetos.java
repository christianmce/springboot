public void insertar_objetos(){

       List<Telefono> lista = new ArrayList<Telefono>();
			 Telefono t = new Telefono();
			 t.setId(2L);
			 t.setTlf("962547544");
			 
			 Persona p2 = new Persona();
			 p2.setEdad(37);
			 p2.setId(7L);
			 p2.setNif("77744766f");
			 p2.setNombre("Mauricio");
			 p2.setProfesion("Analista");
			 
			 t.setPersona(p2);
			 lista.add(t);
			 p2.setListTelefono(lista);

       personaRepository.save(p2);
			 telefonoRepository.save(t);

       //************** Crear e insertar objeto Persona 
       Persona p = new Persona(4L,"6231475x", 37, "Samuel","Capturista",lista);		 
		   personaRepository.deleteAllInBatch();
		   personaRepository.deletePersona("Contabilidad");
       
		   Persona p = new Persona(3L, "7544254148f", 27, "Jose" , "RecursosHumanos");
		   personaRepository.save(p);
		   personaRepository.actualizaNif("77777777k", "48569515t");
		   personaRepository.actualizaNifyNombre("89857556j", "Azul");
}
