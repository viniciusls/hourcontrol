package br.com.viniciusls.hourcontrol.models;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
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

	@Column(nullable = false)
	private String description;
	private String notes;
    @Column(nullable = false)
	private Time period;
    @Column(nullable = false)
	private Date beginTime;
    @Column(nullable = false)
	private Date endTime;
    @Column(nullable = false, columnDefinition = "DATETIME default CURRENT_TIMESTAMP")
	private Date createdAt;
    @Column(columnDefinition = "DATETIME default null on update CURRENT_TIMESTAMP")
    private Date updatedAt;
}
