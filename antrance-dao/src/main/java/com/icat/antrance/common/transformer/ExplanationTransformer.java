package com.icat.antrance.common.transformer;

import com.icat.antrance.common.vo.ExplanationDescriptionVo;
import com.icat.antrance.model.ExplanationDescription;

public class ExplanationTransformer implements Transformer<ExplanationDescription, ExplanationDescriptionVo> {

	@Override
	public ExplanationDescriptionVo transform(ExplanationDescription explanationDescription) {
		if (explanationDescription == null) {
			return null;
		}
		ExplanationDescriptionVo explanationDescriptionVo = new ExplanationDescriptionVo();
		explanationDescriptionVo.setExplanationId(explanationDescription.getExplanationId());
		explanationDescriptionVo.setExplanationTextType(explanationDescription.getExplanationTextType());
		explanationDescriptionVo.setExplanationTextData(explanationDescription.getExplanation());
		/*if (explanationDescription.getExplanationTextType() != null
				&& explanationDescription.getExplanationTextType()) {
			try {
				explanationDescriptionVo
						.setExplanationText(new String(explanationDescription.getExplanation(), "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			explanationDescriptionVo.setExplanationImage(explanationDescription.getExplanation());
		}*/
		explanationDescriptionVo.setQuestionId(explanationDescription.getQuestionId());
		return explanationDescriptionVo;
	}

}
