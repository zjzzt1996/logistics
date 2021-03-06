package cn.zzt.graduation.logistics.client.mvp;

import cn.zzt.graduation.logistics.client.place.AboutUsPlace;
import cn.zzt.graduation.logistics.client.place.LoginPlace;
import cn.zzt.graduation.logistics.client.place.ModifyInfoPlace;
import cn.zzt.graduation.logistics.client.place.ModifyPasswordPlace;
import cn.zzt.graduation.logistics.client.place.MyPlace;
import cn.zzt.graduation.logistics.client.place.RegisterPlace;
import cn.zzt.graduation.logistics.client.place.SettingPlace;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * MVP结构中Place绑定声明类
 * 
 * @author zhangtao.zhou
 * @version 2018年3月26日下午2:52:10
 */
public class PlaceFactory {
	@Inject
	MyPlace.Tokenizer myTokenizer;

	@Inject
	Provider<MyPlace> myProvider;

	public MyPlace getMyPlace() {
		return myProvider.get();
	}

	public MyPlace.Tokenizer getMyPlaceTokenizer() {
		return myTokenizer;
	}

	@Inject
	LoginPlace.Tokenizer loginTokenizer;

	@Inject
	Provider<LoginPlace> loginProvider;

	public LoginPlace getLoginPlace(){
		return loginProvider.get();
	}
	
	public LoginPlace.Tokenizer getLoginPlaceTokenizer(){
		return loginTokenizer;
	}
	
	
	@Inject
	RegisterPlace.Tokenizer registerTokenizer;

	@Inject
	Provider<RegisterPlace> registerProvider;

	public RegisterPlace getRegisterPlace(){
		return registerProvider.get();
	}
	
	public RegisterPlace.Tokenizer getRegisterPlaceTokenizer(){
		return registerTokenizer;
	}
	
	@Inject
	AboutUsPlace.Tokenizer aboutusTokenizer;

	@Inject
	Provider<AboutUsPlace> aboutusProvider;

	public AboutUsPlace getAboutusPlace(){
		return aboutusProvider.get();
	}
	
	public AboutUsPlace.Tokenizer getAboutUsPlaceTokenizer(){
		return aboutusTokenizer;
	}	
	
	@Inject
	SettingPlace.Tokenizer settingTokenizer;

	@Inject
	Provider<SettingPlace> settingProvider;

	public SettingPlace getSettingPlace(){
		return settingProvider.get();
	}
	
	public SettingPlace.Tokenizer getSettingPlaceTokenizer(){
		return settingTokenizer;
	}	
	
	@Inject
	ModifyPasswordPlace.Tokenizer modifyPasswordTokenizer;

	@Inject
	Provider<ModifyPasswordPlace> modifyPasswordProvider;

	public ModifyPasswordPlace getModifyPasswordPlace(){
		return modifyPasswordProvider.get();
	}
	
	public ModifyPasswordPlace.Tokenizer getModifyPasswordPlaceTokenizer(){
		return modifyPasswordTokenizer;
	}	
	
	@Inject
	ModifyInfoPlace.Tokenizer modifyInfoPlaceTokenizer;

	@Inject
	Provider<ModifyInfoPlace> modifyInfoPlaceProvider;

	public ModifyInfoPlace getModifyInfoPlacePlace(){
		return modifyInfoPlaceProvider.get();
	}
	
	public ModifyInfoPlace.Tokenizer getModifyInfoPlacePlaceTokenizer(){
		return modifyInfoPlaceTokenizer;
	}	
}
