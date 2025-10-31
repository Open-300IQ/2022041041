<<<<<<< HEAD
package com.mysite.sbb.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
	@Size(min = 3, max=25)
	@NotEmpty(message = "사용자 ID는 필수 항목입니다.")
	private String username;
	
	@NotEmpty(message = "비밀번호는 필수 항목입니다.")
	private String password1;
	
	@NotEmpty(message = "비밀번호 확인은 필수 항목입니다.")
	private String password2;
	
	@NotEmpty(message = "이메일은 필수 항목입니다.")
	@Email
	private String email;
}
=======
package com.mysite.sbb.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
	@Size(min = 3, max=25)
	@NotEmpty(message = "사용자 ID는 필수 항목입니다.")
	private String username;
	
	@NotEmpty(message = "비밀번호는 필수 항목입니다.")
	private String password1;
	
	@NotEmpty(message = "비밀번호 확인은 필수 항목입니다.")
	private String password2;
	
	@NotEmpty(message = "이메일은 필수 항목입니다.")
	@Email
	private String email;
}
>>>>>>> d33bc38e305935db62527ada7b813d773719fe6c
