package com.SpringbootCassandra.Model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table

public class Imteyaz {
	@PrimaryKey
	private int id;
	private String name;
	private String address;
	private int age;

}
