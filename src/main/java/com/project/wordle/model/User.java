package com.project.wordle.model;

import com.project.wordle.enumeration.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.SQLDelete;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

/**
 * Entity representing a user.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@SQLDelete(sql = "UPDATE users SET deleted = true WHERE id=?")
@FilterDef(name = "deletedUserFilter", parameters = @ParamDef(name = "isDeleted", type = Boolean.class))
@Filter(name = "deletedUserFilter", condition = "deleted = :isDeleted")
public class User extends BaseEntity<Long> implements UserDetails {

    /**
     * The user's firstname.
     */
    private String firstname;

    /**
     * The user's lastname.
     */
    private String lastname;

    /**
     * The user's password.
     */
    private String password;

    /**
     * The user's email address.
     */
    @Size(max = 320)
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
    @Column(unique = true)
    private String email;

    /**
     * The user's mobile number.
     */
    @Column
    private String mobileNumber;

    /**
     * The user's date of birth.
     */
    @Column
    private LocalDate dateOfBirth;

    /**
     * The user's mobile address.
     */
    @Column
    private String address;

    /**
     * This variable stores a 'String' that contains the URL of an image file.
     * The URL can be used to retrieve the image and display it in an application or on webpage.
     */
    @Column
    private String imageUrl;

    /**
     * The role of the user.
     */
    @Enumerated(EnumType.STRING)
    private Role role;

    /**
     * The tokens associated with the user.
     */
    @OneToMany(mappedBy = "user")
    private List<Token> tokens;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return role.getAuthorities();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
