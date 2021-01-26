
<code>@Transactional
public interface PersonaRepository extends JpaRepository<Persona, Long> 
{

	@Query("Select p from Persona p where id = ?1")
	public Persona findById(Long id);

	@Query("Select p.profesion from Persona p")
	public List<Persona> listaProfesiones();

	@Modifying
	@Transactional
	@Query("delete from Persona p where p.profesion = ?1")
	publicvoiddeletePersona(String profesion);

	@Modifying
	@Transactional
	@Query("update Persona p set p.nif = ?1 where p.nif = ?2")
	publicvoidactualizaNif(String nifO, String nifD);
	
	@Modifying
	@Transactional
	@Query("update Persona p set p.nif = ?1, p.nombre = ?2 where p.nif = '5785693k'")
	publicvoidactualizaNifyNombre(String nif, String nombre);

}
