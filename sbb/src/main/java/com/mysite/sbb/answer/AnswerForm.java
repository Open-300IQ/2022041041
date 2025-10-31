<<<<<<< HEAD
package com.mysite.sbb.answer;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerForm {
	@NotEmpty(message="내용은 필수 항목입니다.")
	private String content;
}
=======
package com.mysite.sbb.answer;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerForm {
	@NotEmpty(message="내용은 필수 항목입니다.")
	private String content;
}
>>>>>>> d33bc38e305935db62527ada7b813d773719fe6c
