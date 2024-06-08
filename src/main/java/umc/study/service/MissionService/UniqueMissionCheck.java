package umc.study.service.MissionService;


public interface StoreRepository extends JpaRepository<Store, Integer> {
    boolean existsById(Integer id);
}
