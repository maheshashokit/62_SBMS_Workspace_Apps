package com.ashokit.dto;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(description = "Request Payload for Creating the Person Record....")
public class PersonDTO {

	@Schema(description = "PersonID Will be auto generated....")
	private Integer id;
	
	@Schema(description = "PersonName",example = "Mahesh")
	private String name;

	@Schema(description = "PersonLocation",example="Hyderabad")
	private String location;
	
	@Schema(description = "PersonEmailID",example="mahesh.ashokit@gmail.com")
	private String emailId;
	
	@Schema(description = "PersonAddress",example="Hyderabad,Ameerpet")
	private String address;
	
	@Schema(description = "Person Record CreatedData Will be autogenerated.....")
	private LocalDateTime createdDate;
}