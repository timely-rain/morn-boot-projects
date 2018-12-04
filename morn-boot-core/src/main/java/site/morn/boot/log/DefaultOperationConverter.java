package site.morn.boot.log;

import java.util.Date;
import site.morn.bean.annotation.Tag;
import site.morn.log.OperateMeta;
import site.morn.log.Operation;
import site.morn.log.OperationConverter;
import site.morn.translate.Translator;

/**
 * 默认操作日志转换器
 *
 * @author timely-rain
 * @since 1.0.0, 2018/12/4
 */
@Tag("converter")
public class DefaultOperationConverter implements OperationConverter {

  private final Translator translator;

  public DefaultOperationConverter(Translator translator) {
    this.translator = translator;
  }

  @Override
  public Operation generic(OperateMeta operateMeta) {
    String messageCode = operateMeta.getModule() + "." + operateMeta.getName();
    String content = translator.translate(messageCode, operateMeta.getArguments());
    return Operation.builder().success(operateMeta.isSuccess())
        .module(operateMeta.getModule()).content(content).date(new Date()).build();
  }
}