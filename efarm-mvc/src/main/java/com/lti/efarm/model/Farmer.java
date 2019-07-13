package com.lti.efarm.model;

import java.util.Base64;

import javax.persistence.*;



@Entity
@Table(name="farmer")
public class Farmer
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="farmid_generator")
	@SequenceGenerator(name="farmid_generator", sequenceName="farmer_id", allocationSize=1)
	@Column(name="id", updatable=false, nullable=false)
	@PrimaryKeyJoinColumn
    private int id;
	
	@Column(name="fullname")
	private String fullname;
	
	@Column(name="contact")
	private Number contact;
	
	@Column(name="email")
	private String email;
	
	@Column(name="bankdetails")
	private String bankdetails;
	
	@Column(name="farmerpass")
	private String farmerPassword;
	
	@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
	private Address address;
	
	
	
}
