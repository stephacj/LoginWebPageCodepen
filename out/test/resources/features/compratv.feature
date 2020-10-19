#Author:stephanie
#language:es
@Regresion
Característica: Compra de tv por pagina web del exito
  @RunnerTags
  Esquema del escenario: usuario realiza compra de tv por pagina web
    Dado que un usuario quiere comprar un televisor para ver el mundial de futbol
    Cuando ingresa a la página virtual del éxito y selecciona el televisor que más le gusta
      |articulo  |
      |<articulo>|
    Entonces realiza la compra para que le sea enviado a su casa.

    Ejemplos:
      |articulo |
      |Televisor|