package br.com.viniciusls.hourcontrol.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by vinicius.silva on 01/02/2017.
 */

@Entity
@Getter @Setter
@Table(name = "time_tracking_itens")
public class TimeTrackingItem extends AbstractModel implements Serializable {

	private static final long serialVersionUID = -2985728131534680454L;

	private Date beginTime;
	private Date endTime;
	private Date createdAt;
}
