package com.lebq.desafioTecnico.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Exchange implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;

    private String username;

    private Double initialAmmount;

    private Double finalAmmount;

    private Double exchange;

    private Date processDate;
}
