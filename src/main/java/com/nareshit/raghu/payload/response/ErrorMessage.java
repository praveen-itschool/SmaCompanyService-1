package com.nareshit.raghu.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {
	private String dataTime;
	private String message;
	private int status;
	private String code;
}
