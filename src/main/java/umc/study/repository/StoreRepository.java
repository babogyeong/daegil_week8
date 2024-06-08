package umc.study.repository;

public interface StoreRepository extends JpaRepository<Store, Integer> {
    boolean existsById(Integer id);
}
