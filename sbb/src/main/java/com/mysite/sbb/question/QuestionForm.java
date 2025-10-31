<<<<<<< HEAD
package com.mysite.sbb.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
	@NotEmpty(message="제목은 필수 항목입니다.")
	@Size(max=200)
	private String subject;
	
	@NotEmpty(message="내용은 필수 항목입니다.")
	private String content;
}
=======
package com.mysite.sbb.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
	@NotEmpty(message="제목은 필수 항목입니다.")
	@Size(max=200)
	private String subject;
	
	@NotEmpty(message="내용은 필수 항목입니다.")
	private String content;
}
>>>>>>> d33bc38e305935db62527ada7b813d773719fe6c
