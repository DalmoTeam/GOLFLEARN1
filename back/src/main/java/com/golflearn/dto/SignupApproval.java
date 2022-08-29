package com.golflearn.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode(of = {"approvalUserId"})
public class SignupApproval {
	
	private String approvalUserId;
	private String approvalUserName;
	private String approvalUserNickname;
	private String approvalUserPwd;
	private String approvalUserPhone;
}
