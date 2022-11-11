package ml.streaming.bkostream.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import ml.streaming.bkostream.model.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Userdto {
 
    private Long id;
    private String username;
    private String password;
    private String fullName;
    private String phoneNumber;
    private String email;
    private Boolean status;
    private Date birthaday;
    
    private Set <Role> roles = new HashSet<Role>();

    

}