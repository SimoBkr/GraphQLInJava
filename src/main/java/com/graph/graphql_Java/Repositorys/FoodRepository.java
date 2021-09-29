package com.graph.graphql_Java.Repositorys;

import com.graph.graphql_Java.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface FoodRepository extends JpaRepository<Food,Long> {

}
