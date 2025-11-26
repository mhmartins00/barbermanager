package com.barbershop.barbermanager.barber;

import jakarta.persistence.*;

@Entity
@Table(
        name = "barber",
        uniqueConstraints = {
                @UniqueConstraint(name = "uq_barber_email", columnNames = "email")
        }
)
public class Barber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String name;

    /**
     * Optional CPF (store only if you really need it).
     * @default null
     */
    @Column(length = 11, nullable = true)
    private String cpf;

    /**
     * Unique email for the barber.
     */
    @Column(nullable = false, length = 180)
    private String email;

    private String image;
    private String bio;
    private String phone;

    @Column(nullable = false)
    private Boolean active = true;

    public Barber() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
