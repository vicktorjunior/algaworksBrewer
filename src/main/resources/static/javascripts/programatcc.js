/**
 * Created by VictorJr on 26/03/2017.
 */
$(function() {
    var decimal = $('.js-decimal');
    decimal.maskMoney();

    var inteiro = $('.inteiro');
    inteiro.maskMoney({precision:0});
});