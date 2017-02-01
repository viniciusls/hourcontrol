package br.com.viniciusls.hourcontrol.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by vinicius.silva on 01/02/2017.
 */

@Entity
@Getter @Setter
@MappedSuperclass
public abstract class AbstractModel implements Serializable {
	
	private static final long serialVersionUID = 4071731772513665503L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
