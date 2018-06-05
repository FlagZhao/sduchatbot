package com.sdu.chatbot.model;

public interface ModelFromEntity<F, T extends ModelFromEntity<F, T>>
{
	T fromEntity(F f);
}
