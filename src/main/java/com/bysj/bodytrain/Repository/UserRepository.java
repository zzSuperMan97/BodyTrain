package com.bysj.bodytrain.Repository;

import com.bysj.bodytrain.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    @Query("SELECT u FROM Users u WHERE u.userName=:userName AND u.password =:password")
    List<Users> getUserByNameAndPwd(@Param("userName") String userName, @Param("password") String password);
}
